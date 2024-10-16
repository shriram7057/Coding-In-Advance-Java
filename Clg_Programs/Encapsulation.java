class Encapsulation
{
    private final String email;
    private String address;
    public Encapsulation(final String email)
    {
        this.email=email;
    }
    public String getaddress()
    {
        return address;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
    public String getemail()
    {
        return email;
    }
}