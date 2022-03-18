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
        <div class="id">
            {{props.id}}
        </div>
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
	@import url("@/assets/colort.css");

    .dataRow {
        padding: 8px;
        background: var(--5);
        color: #222;
        display: flex;
    }
    .id {
        min-width: 3em;
    }
    .date {
        flex-grow: 1;
    }
    .hours {
        flex-grow: 1;
    }
    .description {
        flex-grow: 1;
    }
</style>