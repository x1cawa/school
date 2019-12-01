const express = require('express');
const routes = require('./routes');
const bodyParser = require('body-parser');

const serverPort = 3002;
const app = express();

// Start the server
const server = app.listen(serverPort, (error) =>
{
    if (error)
        return console.log(`Error: ${error}`);
 
    console.log(`Server listening on port ${server.address().port}`);
});

// Use Node.js body parsing middleware
app.use(bodyParser.text()); //bodyParser.json()
app.use(bodyParser.urlencoded(
{
    extended: true,
}));

routes(app);