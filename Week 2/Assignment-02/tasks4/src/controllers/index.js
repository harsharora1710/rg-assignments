const txnService = require('../services');

async function getTransactions(req, res) {
  try {
    const transactions = await txnService.getTransactions(); // ✅ correct
    res.status(200).json(transactions);
  } catch (err) {
    res.status(500).json({ message: 'Error fetching transactions', error: err.message });
  }
}

async function getSingleTransaction(req, res) {
  try {
    const id = req.params.id;
    const transaction = await txnService.getTransactions(id); // ✅ pass id here
    if (!transaction) {
      return res.status(404).json({ message: 'Transaction not found' });
    }
    res.status(200).json(transaction);
  } catch (err) {
    res.status(500).json({ message: 'Error fetching transaction', error: err.message });
  }
}

async function createTransaction(req, res) {
  try {
    const { to, amount } = req.body; // ✅ 'to' instead of 'description'
    if (!to || !amount) {
      return res.status(400).json({ message: 'To and amount are required' });
    }
    const id = await txnService.createTransaction({ to, amount }); // ✅ correct usage
    res.status(201).json({ message: 'Transaction created', id });
  } catch (err) {
    res.status(500).json({ message: 'Error creating transaction', error: err.message });
  }
}

module.exports = { getTransactions, getSingleTransaction, createTransaction };
