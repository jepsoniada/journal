<script setup lang="ts">
    import { useGlobalComunication } from "@/stores/comunication"
    import { storeToRefs } from "pinia";
    import type { Row } from "@/shared/types"
    import { ref } from "vue";

    const store = useGlobalComunication()
    
    function closeForm (e) {
        if (e.target.id == "postForm") {
            store.hidePostForm()
        }
    }

    function submit() {
        fetch("/api/setter", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                // dateOfWork: dateOfWork.toISOString().split("T")[0], numberOfHours, description,
                dateOfWork: dateOfWork.value,
                numberOfHours: numberOfHours.value,
                description: description.value,
            }),
        })
    }

    const isVisible = storeToRefs(store).isPostFormShown

    let dateOfWork = ref<string>('')
    let numberOfHours = ref<number>(0)
    let description = ref<string>('')
</script>

<template>
    <div v-if="isVisible" @click="closeForm" id="postForm">
        <div class="form">
            <h2>Add New Element</h2>
            <label>date<input type="date" v-model="dateOfWork"></label>
            <label>number of work hours<input type="number" v-model="numberOfHours"></label>
            <label>description<input v-model="description"></label>
            <div @click="submit" id="submit">
                submit
            </div>
        </div>
    </div>
</template>

<style>
    #postForm {
        position: absolute;
        inset: 0 0 0 0;
        width: 100%;
        height: 100%;
        background: #0008;
        display: grid;
        place-items: center;
    }

    .form {
        display: flex;
        flex-direction: column;
        gap: 8px;
        background: #fff;
        padding: 16px 24px;
        border-radius: 8px;
    }

    .form h2 {
        margin-block: 8px;
    }

    .form label {
        display: flex;
        gap: 16px;
        justify-content: space-between;
    }

    .form #submit {
        background: var(--3);
        border-radius: 8px;
        box-shadow: var(--primary-shadow);
        display: grid;
        place-content: center;
    }
</style>