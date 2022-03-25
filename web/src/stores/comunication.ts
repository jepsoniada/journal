import { defineStore } from 'pinia'

export const useGlobalComunication = defineStore("comunication", {
	state: () => ({
		isPostFormShown: false
	}),

	actions: {
		hidePostForm () { this.isPostFormShown = false },
		showPostForm () { this.isPostFormShown = true }
	}
	// getters: {
	// 	doubleCount: (state) => state.counter * 2
	// },

	// actions: {
	// 	increment() {
	// 		this.counter++
	// 	}
	// }
})
