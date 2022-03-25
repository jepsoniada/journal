<script setup lang="ts">
	import Table from "./components/Table.vue"
	import Control from "./components/Control.vue"
	import PostForm from "./components/PostForm.vue"
</script>

<template>
	<div id="app-wrap">
		<Table></Table>
		<Control></Control>
	</div>
	<PostForm></PostForm>
</template>

<style>
	#app {
		--padH: 24px;
		--padW: 24px;
		position: absolute;
		display: flex;
		flex-direction: column;
		align-items: center;
		padding: var(--padH) var(--padW);
		min-height: calc(100% - var(--padH) * 2);
		width: calc(100% - var(--padW) * 2);
	}

	#app-wrap {
		display: flex;
		flex-direction: row;
		gap: 8px;
		width: 100%;
		max-width: 1200px;
	}

	#table {
		flex-grow: 1;
	}
</style>