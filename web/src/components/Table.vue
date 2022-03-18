<script setup lang="ts">
	import DataRow from './DataRow.vue';

	import { ref, onBeforeMount } from "vue";
	import type { Row, RowJson } from "../shared/types"

	interface Row {
		id: number
		numberOfHours: number
		description: string
		dateOfWork: Date
	}

    let idsOfNotes = ref<Row[]>([])

    onBeforeMount(async () => {
		// const ids = [...Array(10).keys()]
		// 	.map(e => e+1)
		const asdf: RowJson[] = [await (await fetch("/api/v1/getAll")).json()].flat()
        idsOfNotes.value = asdf.map(e => ({id: e.id, dateOfWork: new Date(e.dateOfWork), numberOfHours: e.numberOfHours, description: e.description}))
    })
</script>

<template>
	<div id="table">
		<DataRow v-for="e in idsOfNotes" :v="e" :key="e.id"></DataRow>
	</div>
</template>

<style>
	@import url("@/assets/colort.css");
	#table {
		padding: 8px;
		background: var(--3);
		display: flex;
		flex-direction: column;
		gap: 4px;
	}
</style>