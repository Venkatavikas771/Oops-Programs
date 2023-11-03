class BankAccount { 
 private long accnum;
     private long accbalance;

    public void setAccnum(long accnum)
    {
      this.accnum=accnum;
    }
        public void setAccbalance(long accbalance)
    {
      this.accbalance=accbalance;
    }
    public long getAccnum()
    {
      return accnum;
    }
    public long getAccbalance()
    {
      return accbalance;
    }
    
    
  }
class Experthacker
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the account number");
      long accnum=sc.nextLong();
      System.out.println("Enter the account balance");
      long accbalance=sc.nextLong();
      Bankaccount ob=new Bankaccount();
      ob.setAccnum(accnum);
      ob.setAccbalance(accbalance);
      System.out.println("the account number is :"+ob.getAccnum());
      System.out.println("the balance is :"+ob.getAccbalance());
    }
  }