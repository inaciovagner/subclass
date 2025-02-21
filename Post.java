

/**
 * Write a description of class Post here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Post
{
    private long timestamp;
    

    /**
     * Constructor for objects of class Post
     */
    public Post()
    {
        timestamp = System.currentTimeMillis();

    }
    
    /**
     * Return the time of creation of this post.
     *
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }
    
}
