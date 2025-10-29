---
title: Hướng đối tượng

---

# I. Thành phần
## 1. Class
- Cú pháp: `class class_name{...}`
- Là một kiểu dữ liệu gồm thuộc tính và phương thức được định nghĩa từ trước
- Gồm các đối tượng có đặc tính tương tự
## 2. Object
- Gồm thuộc tính và phương thức 
- Gần giống một con trỏ, thao tác thông qua tham chiếu
- Tạo bằng toán tử **new**
- VD:
```
MyDate d;
d = new MyDate();
```
## 3. Phương thức
- **Overload(nạp chồng)**: phương thức trùng tên, phân biệt bởi danh sách tham số
VD: (Tham số truyền vào khác tên biến hoặc kdl)
```
class MyDate() {
    public boolean setMonth(int a) {...}
    public boolean setMonth(String a) {...}
}
```
- **Constructor(khởi tạo)**: được gọi tự động khi tạo object
    - Tên trùng với tên lớp
    - Không nhận return
- **Abstract(trừu tượng)**: 
    - `abstract public void ten();`
    - Là phương thức bắt buộc phải định nghĩa lại ở lớp dẫn xuất
## 4. Package
- Nếu không khai báo, các lớp thuộc `default package`
- Cùng một mã nguồn, cùng 1 package
## 5. Kiểm soát truy cập
![image](https://hackmd.io/_uploads/S197-s5iex.png)
## 6. Interface(giao diện)
- Là mức trừu tượng cao hơn lớp trừu tượng
- Từ khóa: `interface`, `implements`
# II. Nguyên lí cơ bản
## 1. Inheritance (Kế thừa) 
- Thừa hưởng thuộc tính và phương thức dựa trên một lớp đã có (lớp cha)
    - Tái sử dụng: `super`;
    - Lớp con không cần định nghĩa lại, có thể mở rộng thành phần kế thừa và bổ sung thành phần mới
- `class lopcon extends lopcha{}`
- Có kiểu giá trị trả lại như nhau
- Mức truy cập: thường là `protected`
- Kế thừa khác gói: `import tenpk.tenclass;`
- Binding: 
![image](https://hackmd.io/_uploads/rkyx7icoge.png)
    - Gọi phương thức của lớp A trong lớp Binding
## 2. Polumorphism (Đa hình)
- Đa hình: một hành động thực hiện bằng nhiều cách khác nhau
    - Hàm: trùng tên, phân biệt bằng ds tham số
    - Đối tượng: đối tượng khác nhau giải nghĩa thông điệp theo cách thức khác nhau
## 3. Encapsulation (Đóng gói)
- Các dữ liệu và phương thức liên quan đóng gói thành các lớp tiện quản lí và sử dụng
- Che giấu thông tin và chi tiết cài đặt

## 4. Abstraction (Trừu tượng)
- Tổng quát hóa, không chú ý chi tiết bên trong
- Khởi tạo phương thức ở lớp cha, thân hàm tạo ở lớp con