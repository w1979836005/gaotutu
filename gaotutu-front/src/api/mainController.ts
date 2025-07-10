import request from '@/request/request.ts'

export async function healthUsingGet(options?: { [key: string]: never }) {
  return request<API.BaseResponseString_>('/api/health', {
    method: 'GET',
    ...(options || {}),
  })
}
