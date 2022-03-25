<script setup lang="ts">
	import DataRow from './DataRow.vue';

	import { ref, onBeforeMount } from "vue";
	import type { Row, RowJson } from "../shared/types"

    let idsOfNotes = ref<Row[]>([])

    onBeforeMount(async () => {
		const asdf: RowJson[] = [await (await fetch("/api/getAll")).json()].flat(Infinity)
        idsOfNotes.value = asdf.map(e => ({dateOfWork: new Date(e.dateOfWork), numberOfHours: e.numberOfHours, description: e.description}))
    })
</script>

<template>
	<div id="table">
		<DataRow v-for="e in idsOfNotes" :v="e"></DataRow>
	</div>
</template>

<style>
	@import url("@/assets/color.css");
	#table {
		border-radius: 8px;
		overflow: hidden;
		background: #aaa;
		display: flex;
		flex-direction: column;
		gap: 1px;
        box-shadow: var(--primary-shadow);
	}
</style>