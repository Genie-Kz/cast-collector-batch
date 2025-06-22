-- Work table
CREATE TABLE IF NOT EXISTS work (
    annict_id INTEGER PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    watchers_count INTEGER
);

-- Cast table
CREATE TABLE IF NOT EXISTS "cast" (
    annict_id INTEGER PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    name_en VARCHAR(255),
    work_annict_id INTEGER NOT NULL REFERENCES work(annict_id)
);
