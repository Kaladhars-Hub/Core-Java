main()
│
▼
SwissBank bank = new SwissBank()
│
▼
bank.setBalance(100)
│
▼
setBalance(int balance)
│
▼
Receives value 100
│
▼
Checks if (balance >= 0)
│
├── Yes ─► this.balance = balance
│
└── No ─► "Invalid balance"
│
▼
bank.getBalance()
│
▼
Returns balance
│
▼
System.out.println(...)
│
▼
Output: 100