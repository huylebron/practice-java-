⚙️ Phân tích tư duy thuật toán
❓Bản chất vấn đề:

Ta chỉ cần đếm liên tiếp bao nhiêu số 1, reset khi gặp 0.

Tức là “đếm chuỗi liên tục”, một dạng bài “Counting consecutive elements”.

🔁 Cách làm:

Duyệt toàn bộ mảng bằng vòng for.

Dùng 2 biến:

cur → số lượng 1 liên tiếp hiện tại.

best → giá trị lớn nhất tìm thấy.

Khi gặp 1: tăng cur.

Khi gặp 0: cập nhật best = max(best, cur) rồi reset cur = 0.

Sau khi kết thúc vòng lặp → cập nhật best thêm 1 lần (phòng trường hợp kết thúc bằng 1).