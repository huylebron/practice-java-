## 🧩 Phân tích đề bài

### Input:

- Một chuỗi `s` gồm các từ phân tách bằng **một dấu cách duy nhất**.

- Một số nguyên `k` (1 ≤ k ≤ số lượng từ trong s).


### Output:

- Chuỗi chỉ chứa **k từ đầu tiên** của `s`.




---
## 💡 Hướng tiếp cận

Cách dễ nhất:

1. Dùng `String.split(" ")` để tách chuỗi thành mảng các từ.

2. Lấy `k` phần tử đầu tiên.

3. Dùng `String.join(" ", ...)` để nối lại thành chuỗi kết quả.


```java
public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            result.append(words[i]);
            if (i < k - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        
        ;
        
        
    }
}

```


## ⚙️ Giải thích

- `split(" ")`: tách câu thành mảng từ.

- `StringBuilder`: nối nhanh hơn dùng dấu `+`.

- Vòng `for` chạy tới `k` từ, thêm dấu cách giữa các từ nhưng **không thêm ở cuối**.



---
💡 Kiến Thức về `StringBuilder` trong Java

- Trong java , lớp Stringbuilder là một công cụ mạnh mẽ được  thiết kế để sử lý các thao tác chuỗi hiệu quả hơn với lớp String thông thường

### Sự Khác Biệt Cốt Lõi: `String` vs `StringBuffer` vs `StringBuilder`

|**Đặc điểm**|**String**|**StringBuffer**|**StringBuilder**|
|---|---|---|---|
|**Tính chất**|Bất biến (**Immutable**)|Khả biến (**Mutable**)|Khả biến (**Mutable**)|
|**Hiệu suất**|Kém cho việc thay đổi chuỗi nhiều lần|Chậm hơn `StringBuilder`|**Nhanh nhất**|
|**Đồng bộ**|Không áp dụng|**Đồng bộ (Synchronized)**|**Không đồng bộ** (Non-synchronized)|
|**Ứng dụng**|Dùng khi giá trị chuỗi không đổi.|Dùng trong môi trường đa luồng (Multi-threading).|Dùng trong môi trường đơn luồng (Single-threading) hoặc khi không cần đồng bộ.|


### 2. Các Phương Thức Quan Trọng

`StringBuilder` cung cấp nhiều phương thức mạnh mẽ để thao tác chuỗi:

|**Phương thức**|**Mô tả**|**Ví dụ (Giả sử sb là một StringBuilder)**|
|---|---|---|
|`append(...)`|Nối thêm dữ liệu (chuỗi, số, boolean, char,...) vào cuối chuỗi.|`sb.append("World");`|
|`insert(index, data)`|Chèn dữ liệu vào vị trí (index) được chỉ định.|`sb.insert(5, "Java ");`|
|`replace(start, end, str)`|Thay thế một đoạn chuỗi từ `start` (bao gồm) đến `end` (không bao gồm) bằng chuỗi mới.|`sb.replace(0, 4, "Hello");`|
|`delete(start, end)`|Xóa các ký tự từ `start` (bao gồm) đến `end` (không bao gồm).|`sb.delete(0, 6);`|
|`reverse()`|Đảo ngược thứ tự các ký tự trong chuỗi.|`sb.reverse();`|
|`length()`|Trả về độ dài hiện tại của chuỗi.|`int len = sb.length();`|
|`toString()`|Chuyển đối tượng `StringBuilder` thành đối tượng `String`. **Bắt buộc dùng khi muốn sử dụng kết quả.**|`String result = sb.toString();`|