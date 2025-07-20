const express = require('express');
const router = express.Router();

const {
  getTransactions,
  getSingleTransaction,
  createTransaction
} = require('./controllers');

// Get all transactions
router.get('/', getTransactions);

// Get a single transaction by ID
router.get('/:id', getSingleTransaction);

// Create a new transaction
router.post('/', createTransaction);

module.exports = router;
