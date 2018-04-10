class Singleton {
  public String str;
  private static Singleton instance = null;
  private Singleton() {str = "Hello, I am a singleton!";}
  public static synchronized Singleton getSingleInstance() {
    if (instance == null)
      instance = new Singleton(); 
    return instance;
  }
  /* Uncomment below to add Serialization support
  private Object readResolve() {
   return instance;
  }*/
}
