const express = require('express');
const morgan = require('morgan');
const bodyParser = require('body-parser');

const routes = require('./routes');

const app = express();
const PORT = 3000;

// Middleware
app.use(morgan('dev'));
app.use(bodyParser.json());

// Routes
app.use('/transactions', routes);

// Default route
app.get('/', (req, res) => {
  res.send('Transaction API is running');
});

// Start the server
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
