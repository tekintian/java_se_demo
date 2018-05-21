create database restaurant
on primary
(name='data_1',
filename='E:\sqlProgram\mhlPro\data\data_1.mdf',
size=3MB,maxsize=200MB,
filegrowth=500KB),
filegroup data2
(name='data_2',
filename='E:\sqlProgram\mhlPro\data\data_2.ndf',
size=1MB,maxsize=100MB,
filegrowth=500KB)
log on
(name='log_1',
filename='E:\sqlProgram\mhlPro\log_1.ldf',
size=1MB,maxsize=100MB,
filegrowth=500KB)
go
use restaurant
go
--������½�û�����Ϣ��
create table clerkInfo
(
cleId nvarchar(30)primary key not null,
cleName nvarchar(30) not null,
cleSex nchar(1 )check(cleSex in('��','Ů')) default 'Ů' not null,
cleAge int check(cleAge>1)not null,
cleZw nvarchar(30)not null,
)
go

--�����û���½
create table login
(
cleId nvarchar(30) foreign key references clerkInfo(cleId),
passwd nvarchar(30) not null
)
go


insert into clerkInfo values('m001','���','Ů',25,'����')
insert into clerkInfo values('m002','��÷','Ů',23,'����Ա')
insert into clerkInfo values('m003','��С��','��',28,'����')
insert into clerkInfo values('m004','����','Ů',30,'���')
insert into clerkInfo values('m005','����','Ů',24,'����Ա')
insert into clerkInfo values('m006','������','Ů',26,'����Ա')
insert into clerkInfo values('m007','�·�','Ů',28,'����Ա')
go

insert into login values('m001','mhl001')
insert into login values('m002','mhl002')
insert into login values('m003','mhl003')
go


select * from clerkInfo
select * from login


select l.cleId,l.passwd,c.cleName,c.cleZw 
from clerkInfo c,login l 
where c.cleId=l.cleId  
order by cleAge
