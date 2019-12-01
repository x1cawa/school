const pool = require('./dbconfig'); // Load the MySQL pool connection

const router = app =>
{
    app.get('/', (request, response) =>
    {
        console.log(`URL GET: ${request.url}`);
        response.send(
        {
            message: 'Node.js and Express REST API'
        });
    });

    app.get('/authors', (request, response) => {
        console.log(`URL GET: ${request.url}`);

        pool.query('SELECT * FROM authors', (error, result) => {
            if (error) throw error;
     
            response.send(result);
        });
    });

    app.get('/bridges', (request, response) => {
        console.log(`URL GET: ${request.url}`);

        pool.query(
            'SELECT blog.name as blog_name, sub.name as sub_name FROM subs as sub, blogs as blog, blogs_subs as bridge WHERE sub.id = bridge.id_sub and bridge.id_blog = blog.id',
            (error, result) =>
        {
            if (error) throw error;
     
            response.send(result);
        });
    });

    app.get('/news', (request, response) => {
        console.log(`URL GET: ${request.url}`);

        pool.query(
            'SELECT * FROM news',
            (error, result) =>
        {
            if (error) throw error;
     
            response.send(result);
        });
    });

    app.post('/news', (request, response) =>
    {
        console.log(`URL POST: ${request.url}`);

        pool.query(`INSERT INTO news SET ${request.body}`, (error, result) =>
        {
            if (error) throw error;

            response.status(201).send(`News added with ID: ${result.insertId}`);
        });
    });

    app.put('/news/:id', (request, response) =>
    {
        console.log(`URL PUT: ${request.url}`);

        pool.query(`UPDATE news SET ${request.body} WHERE id = ${request.params.id}`, (error, result) =>
        {
            if (error) throw error;

            response.send(`News updated successfully.`);
        });
    });

    app.delete('/news/:id', (request, response) => {    
        pool.query(`UPDATE news SET deleted=1 WHERE id = ${request.params.id}`, (error, result) =>
        {
            if (error) throw error;
    
            response.send('News deleted.');
        });
    });
}

// Export the router
module.exports = router;