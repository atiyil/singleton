class Singleton{
  public String str;
  private static Singleton instance;
  private Singleton(){str = "Hello, I am a singleton!";}
  public static Singleton getSingleInstance(){
    if (instance == null)
      instance = new Singleton(); 
    return instance;
  }
}
