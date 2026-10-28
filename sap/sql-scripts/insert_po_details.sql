INSERT INTO po_detail (po_id, created_at, description, state)
VALUES
(1, '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'CREATED'),
(2, '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'PENDING'),
(3, '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'APPROVED'),
(4, '2026-10-21 14:45:00', 'Purchase Order for Mice', 'REJECTED'),
(5, '2026-10-22 08:30:00', 'Purchase Order for Printers', 'CREATED'),
(6, '2026-10-22 12:00:00', 'Purchase Order for Servers', 'PENDING'),
(7, '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'APPROVED'),
(8, '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'CREATED'),
(9, '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'PENDING'),
(10, '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'APPROVED');

INSERT INTO po_history (id, po_id, po_item, created_at, description, state)
VALUES
(1001, 1, 501, '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'CREATED'),
(1002, 2, 502, '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'PENDING'),
(1003, 3, 503, '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'APPROVED'),
(1004, 4, 504, '2026-10-21 14:45:00', 'Purchase Order for Mice', 'REJECTED'),
(1005, 5, 505, '2026-10-22 08:30:00', 'Purchase Order for Printers', 'CREATED'),
(1006, 6, 506, '2026-10-22 12:00:00', 'Purchase Order for Servers', 'PENDING'),
(1007, 7, 507, '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'APPROVED'),
(1008, 8, 508, '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'CREATED'),
(1009, 9, 509, '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'PENDING'),
(1010, 10, 510, '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'APPROVED');

INSERT INTO po_item (po_id, item_id, created_at, description, state, material_id, plant_id, receipt_id, schedule_id)
VALUES
(1, 501, '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'CREATED', 1501, 701, 301, 901),
(2, 502, '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'PENDING', 1502, 702, 302, 902),
(3, 503, '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'APPROVED', 1503, 703, 303, 903),
(4, 504, '2026-10-21 14:45:00', 'Purchase Order for Mice', 'REJECTED', 1504, 704, 304, 904),
(5, 505, '2026-10-22 08:30:00', 'Purchase Order for Printers', 'CREATED', 1505, 705, 305, 905),
(6, 506, '2026-10-22 12:00:00', 'Purchase Order for Servers', 'PENDING', 1506, 706, 306, 906),
(7, 507, '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'APPROVED', 1507, 707, 307, 907),
(8, 508, '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'CREATED', 1508, 708, 308, 908),
(9, 509, '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'PENDING', 1509, 709, 309, 909),
(10, 510, '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'APPROVED', 1510, 710, 310, 910);

INSERT INTO po_material (location, po_item, created_at, description, state, id)
VALUES
("Sec 66, Noida", 501, '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'CREATED', 1501),
("Sec 124, Noida", 502, '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'PENDING', 1502),
("Abc Bengaluru", 503, '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'APPROVED', 1503),
("Xyz, Kerala", 504, '2026-10-21 14:45:00', 'Purchase Order for Mice', 'REJECTED', 1504),
("Varli, Mumbai", 505, '2026-10-22 08:30:00', 'Purchase Order for Printers', 'CREATED', 1505),
("Gomti Nagar, Lko", 506, '2026-10-22 12:00:00', 'Purchase Order for Servers', 'PENDING', 1506),
("MohanNagar, Gzb", 507, '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'APPROVED', 1507),
("Abc Gujrat", 508, '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'CREATED', 1508),
("44, 39/3 Greater Noida", 509, '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'PENDING', 1509),
("33/99, Kanpur", 510, '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'APPROVED', 1510);

INSERT INTO po_payment (id, po_id, po_item, paid_on, description, state)
VALUES
(10001, 1, 501, '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'INITIATED'),
(10002, 2, 502, '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'PENDING'),
(10003, 3, 503, '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'APPROVED'),
(10004, 4, 504, '2026-10-21 14:45:00', 'Purchase Order for Mice', 'REJECTED'),
(10005, 5, 505, '2026-10-22 08:30:00', 'Purchase Order for Printers', 'INITIATED'),
(10006, 6, 506, '2026-10-22 12:00:00', 'Purchase Order for Servers', 'PENDING'),
(10007, 7, 507, '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'APPROVED'),
(10008, 8, 508, '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'INITIATED'),
(10009, 9, 509, '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'PENDING'),
(10010, 10, 510, '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'APPROVED');

INSERT INTO po_plant (item_id, item_name, created_at, description, state, id, name, location)
VALUES
(501, "Mouse", '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'OPEN', 701, "JK Mouses", "Moradabad"),
(502, "Computer", '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'WORKING', 702, "AK DELL Computers", "Gorakhpur"),
(503, "Keyboard", '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'WORKING', 703, "MPP Accesories", "Bhiwandi"),
(504, "Samsung Mobile", '2026-10-21 14:45:00', 'Purchase Order for Mice', 'TEMPARORY CLOSED', 704, "Noida Mobiles Ltd", "Noida"),
(505, "AI+ Nova Ultra", '2026-10-22 08:30:00', 'Purchase Order for Printers', 'OPEN', 705, "Sobhit Mobiles", "Bengaluru"),
(506, "Peanut", '2026-10-22 12:00:00', 'Purchase Order for Servers', 'WORKING', 706, "Abc Dry Fruits", "Kanpur"),
(507, "Jogur Jeans", '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'OPEN', 707, "Jogur Jeans Ltd", "Mirzapur"),
(508, "Zudio T-Shirt", '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'PARTIALLY WORKING', 708, "Zudio Clothing Ltd", "Greater Noida"),
(509, "Zudio Sports Shoe", '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'WORKING', 709, "Zudio Clothing Ltd", "Jaipur"),
(510, "Boom Perfume", '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'OPEN', 710, "Dada cents", "Varanasi");

INSERT INTO po_receipt (id, po_id, po_item, created_at, description, state)
VALUES
(100001, 1, 501, '2026-10-20 10:15:00', 'Purchase Order for Laptops', 'CREATED'),
(100002, 2, 502, '2026-10-20 11:30:00', 'Purchase Order for Monitors', 'PENDING'),
(100003, 3, 503, '2026-10-21 09:00:00', 'Purchase Order for Keyboards', 'APPROVED'),
(100004, 4, 504, '2026-10-21 14:45:00', 'Purchase Order for Mice', 'REJECTED'),
(100005, 5, 505, '2026-10-22 08:30:00', 'Purchase Order for Printers', 'CREATED'),
(100006, 6, 506, '2026-10-22 12:00:00', 'Purchase Order for Servers', 'PENDING'),
(100007, 7, 507, '2026-10-23 10:00:00', 'Purchase Order for Networking Equipment', 'APPROVED'),
(100008, 8, 508, '2026-10-24 16:20:00', 'Purchase Order for Storage Devices', 'CREATED'),
(100009, 9, 509, '2026-10-25 09:45:00', 'Purchase Order for Office Furniture', 'PENDING'),
(100010, 10, 510, '2026-10-26 13:15:00', 'Purchase Order for Software Licenses', 'APPROVED');
