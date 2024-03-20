<h1 align="center">Welcome to readme Course Management 👋</h1>


This is a [Course Management project] project build base on Java Swing and Database [`SQL server`]
 

## 🚀 ScreeenShot

![Screenshot 2024-03-20 175117](https://github.com/jihto/Course-Management/assets/93372749/d905f397-deb7-4da9-9d33-f5e0cd8d2312)

![Screenshot 2024-03-20 175315](https://github.com/jihto/Course-Management/assets/93372749/a9fa6e2d-ae08-46cd-af87-5800257814fd)

![Screenshot 2024-03-20 175329](https://github.com/jihto/Course-Management/assets/93372749/f52a9f4a-0623-4d3e-9a4e-dfd69f373eaf)

![Screenshot 2024-03-20 175329](https://github.com/jihto/Course-Management/assets/93372749/4b96ebc8-2eb7-4fa0-9472-fe33ec6c347d)

![Screenshot 2024-03-20 175443](https://github.com/jihto/Course-Management/assets/93372749/6cac98e3-a607-4400-9a12-acac383dc13b)

## To Getting Started

SQL server is used in this program. You can find the necessary jar file for SQL server java connection here:


```bash
  (https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver16)
```


Or you can use a different database but for this to work, change:

```bash
  DriverManager.getConnection("jdbc:database://host:port/database-name", "user-name", "password");
```


 And finally, in order not to get a database error, you should add the following tables to the database:

 ```bash

  Tbl_MonHoc ( ID, MaMon, TenMon, HocKy )
  Tbl_GiangVien(ID, MaGV, TenGV, SDTGV, emailGV )
  Tbl_SinhVien( MaSV, TenSV, SDT, QueQuan, GioiTinh )
  Tbl_QuanLyMonHocSinhVien( ID, MaSV, TenSV, MaMon, TenMon, HocKy, Diem, TrangThai )

```

## Author
👤 **--Jihto--**

- Twitter: [@Jihto](https://twitter.com/)
- Github: [@Jihto](https://github.com/jihto)
 ---
 
