public class CommunicationProtocol{
    
    private String _receiver;
    private String _sender;
    private String _message;
    private int _type;
    private String _answer;
    
    public String getReceiver()
    {
        return _receiver;
    }
    
    public void setReceiver(String rcv)
    {
        this._receiver = rcv;
    }
    
    public String getSender()
    {
        return _sender;
    }
    
    public void setSender(String snd)
    {
        this._sender = snd;
    }
    
    public String getMessage()
    {
        return _message;
    }
    
    public void setMessage(String msg)
    {
        this._message = msg;
    }
    
    public int getType()
    {
        return _type;
    }
    
    public void setType(int t)
    {
        this._type = t;
    }
    
    public String getAnswer()
    {
        return _answer;
    }
    
    public void setAnswer(String ans)
    {
        this._answer = ans;
    }
    
    public CommunicationProtocol(String rcv,String snd,String msg,int t)
    {
        this._receiver = rcv;
        this._sender = snd;
        this._message = msg;
        this._type = t;
    }
}
