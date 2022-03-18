<script setup lang="ts">
import Table from "./components/Table.vue"
</script>

<template>
	<Table></Table>
</template>

<style>
	#app {
		--padH: 24px;
		--padW: 24px;
		position: absolute;
		display: flex;
		flex-direction: column;
		padding: var(--padH) var(--padW);
		min-height: calc(100% - var(--padH) * 2);
		width: calc(100% - var(--padW) * 2);
	}
</style>