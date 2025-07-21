-- If "address_id_seq" doesn't exist, create it
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_class WHERE relname = 'address_id_seq') THEN
CREATE SEQUENCE address_id_seq;
END IF;
END$$;

-- Set "id" column to use the sequence
ALTER TABLE address ALTER COLUMN id SET DEFAULT nextval('address_id_seq');

-- Ensure id is NOT NULL
ALTER TABLE address ALTER COLUMN id SET NOT NULL;

-- Make sure the sequence is owned by the column
ALTER SEQUENCE address_id_seq OWNED BY address.id;
