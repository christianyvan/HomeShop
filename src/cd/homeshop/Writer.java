package cd.homeshop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * write a line
     * @param Line
     */
    public void writeLine(String Line);

    /**
     * stop writing process
     */
    public void stop();
}
