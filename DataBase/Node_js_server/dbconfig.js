const mysql = require('mysql');

// Set database connection credentials
const dbConfig = {
    host: 'localhost',
    user: 'root',
    password: 'admin',
    database: 'api',
};

// Create a MySQL pool
const pool = mysql.createPool(dbConfig);

// Export the pool
module.exports = pool;