<h1 align="center">Welcome to readme Course Management 👋</h1>


This is a [Course Management project] project build base on Java Swing and Database [`SQL server`]
 

## 🚀 ScreeenShot

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
 
