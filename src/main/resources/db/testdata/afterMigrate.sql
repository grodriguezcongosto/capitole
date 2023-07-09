
INSERT INTO price (id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES ('378097c2-cbd8-4065-ad6c-09d6ae56e73e', 1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR')
ON CONFLICT DO NOTHING;


INSERT INTO price (id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES ('e6e912ab-48da-4fb2-adbd-8b68bd5780d0', 1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR')
ON CONFLICT DO NOTHING;


INSERT INTO price (id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES ('e543d404-2b53-405b-a0ed-80187e73775e', 1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR')
ON CONFLICT DO NOTHING;


INSERT INTO price (id, brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES ('c91c2390-36d5-4702-a64d-da10b2df2e3f', 1, '2020-06-15 16:00:00', ' 2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR')
ON CONFLICT DO NOTHING;

