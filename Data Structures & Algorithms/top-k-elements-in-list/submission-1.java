class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Bước 1: Đếm tần suất xuất hiện bằng Map
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Bước 2: Dùng Min-Heap để giữ K phần tử có tần suất lớn nhất
        // Sắp xếp Heap dựa vào số lần xuất hiện (giá trị trong Map) tăng dần
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> countMap.get(a) - countMap.get(b)
        );

        for (int num : countMap.keySet()) {
            heap.add(num); // Thêm phần tử vào heap
            if (heap.size() > k) {
                heap.poll(); // Nếu heap vượt quá k phần tử, xóa phần tử xuất hiện ít nhất đi
            }
        }

        // Bước 3: Lấy k phần tử trong heap bỏ vào mảng kết quả
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}
