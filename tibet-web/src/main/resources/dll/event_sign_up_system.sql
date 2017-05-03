

-- ====================================================
-- database tibet
-- ====================================================

-- ====================================================
-- event_sign_up_basic_info table
-- ====================================================
#drop table event_sign_up_basic_info;


create table event_sign_up_basic_info (
  id MEDIUMINT NOT NULL AUTO_INCREMENT
  , serial_number varchar(15) NOT NULL
  , name varchar(50) NOT NULL
  , sex varchar(1)   NOT NULL
  , phone varchar(11) NOT NULL
  , identity_card varchar(18) NOT NULL
  , department varchar(50) NOT NULL
  , post varchar(50)  NOT NULL
  , nation varchar(30)   NOT NULL               
  , diet    varchar(1)
  , mail   varchar(50)
  , escort    varchar(1)
  , emergency_contact    varchar(50)
  , emergency_contact_phone    varchar(11)
  , enter_tibet_date    datetime
  , enter_flight    varchar(1)
  , enter_train    varchar(1)
  , enter_tibet_remarks varchar(50)
  , Leave_tibet_date    datetime
  , leave_flight    varchar(2)
  , leave_train    varchar(2)
  , leave_tibet_remarks varchar(50)
  , get_accommodation    varchar(1)
  , check_in_date    datetime
  , check_out_date    datetime
  , reimbursement_standard    varchar(10)  
  , need_to_transfer_station    varchar(1)
  , metting_ids    varchar(20)
  , remarks    varchar(2)
  , primary key(id)
  )
;

-- ====================================================
-- sign_up_serial_number table
-- ====================================================
#drop table sign_up_serial_number;

create table sign_up_serial_number (
  serial_number varchar(15) NOT NULL
  , name varchar(50) NOT NULL
  , primary key(serial_number)
  )
;

insert into sign_up_serial_number values ('201705011135111', 'Test')
;
 


















