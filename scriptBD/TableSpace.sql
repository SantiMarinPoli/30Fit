connect / as sysdba;

drop tablespace TS_30FIT including contents and datafiles;

CREATE TABLESPACE TS_30FIT LOGGING
DATAFILE 'C:\Users\FAMILIA\Videos\Documents\DBA\TS_30FIT.dbf' size 1M
extent management local segment space management auto; 

drop user US_30FIT;

create user US_30FIT profile default 
identified by 123 
default tablespace TS_30FIT 
temporary tablespace temp 
account unlock; 

--permisos 

grant connect, resource,dba to US_30FIT; 

connect US_30FIT/123;


 