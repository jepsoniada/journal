<script setup lang="ts">
    import { useGlobalComunication } from "@/stores/comunication"

    const store = useGlobalComunication()

    function showForm() {
        store.showPostForm()
    }
</script>

<template>
    <div id="control">
        <div @click="showForm" id="insert">
            <img src="@/assets/plus.svg">
        </div>
    </div>
</template>

<style>
	@import url("@/assets/color.css");

    #control {
        --width: 40px;
        display: flex;
        flex-direction: column;
        width: var(--width);
    }

    #control > * {
        width: var(--width);
        height: var(--width);
        background: var(--3);
        border-radius: 8px;
        box-shadow: var(--primary-shadow);
        display: grid;
        place-content: center;
    }
    #control img {
        filter: brightness(0) invert(1) brightness(.5);
    }
</style>