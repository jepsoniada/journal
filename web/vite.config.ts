import { fileURLToPath, URL } from 'url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
	plugins: [vue()],
	resolve: {
		alias: {
			'@': fileURLToPath(new URL('./src', import.meta.url))
		}
	},
	server: {
		proxy: {
			"^/api/v1/.*": {
				target: "http://localhost:8080",
				changeOrigin: true,
				secure: false,
				rewrite: e => e,
			}
		},
	}
})