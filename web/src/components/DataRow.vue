<script setup lang="ts">
    import type { Row } from '@/shared/types';
    interface Props {
        v: Row
    }

    const intermidiate = defineProps<Props>()
    const props = Object.freeze(intermidiate.v)

    function dateFormat (date: Date): string {
        return `${date.getMonth()+1}.${date.getDate()}`
    }
</script>

<template>
    <div class="dataRow">
        <!-- <div class="id">
            {{props.id}}
        </div> -->
        <div class="date">
            {{dateFormat(props.dateOfWork)}}
        </div>
        <div class="hours">
            {{props.numberOfHours}}
        </div>
        <div class="description">
            {{props.description}}
        </div>
    </div>
</template>

<style>
	@import url("@/assets/color.css");

    .dataRow {
        display: grid;
        grid: 1fr / repeat(auto-fit, minmax(100px, 1fr));
        padding: 8px 16px;
        gap: 8px;
        height: 24px;
        color: #222;
        background: var(--3);
    }

    .dataRow div {
        display: flex;
        justify-content: center;
    } 

    /* .id {
        min-width: 3em;
    } */

    /* .date {
        flex-grow: 1;
    } */

    /* .hours {
        flex-grow: 1;
    } */

    /* .description {
        flex-grow: 1;
    } */
</style>