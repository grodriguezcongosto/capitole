CREATE TABLE price(
    id uuid CONSTRAINT id_pkey PRIMARY KEY, 
    brand_id integer NOT NULL, 
    start_date timestamp NOT NULL, 
    end_date timestamp NOT NULL, 
    price_list integer NOT NULL, 
    product_id integer NOT NULL, 
    priority integer NOT NULL, 
    price numeric(20,2) NOT NULL, 
    currency varchar(3) NOT NULL);

