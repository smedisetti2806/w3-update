public class cardBoardBoxAvailable implements Box{
    private cardBoardBox box;


    public cardBoardBoxAvailable(cardBoardBox box) {
        this.box = box;
    }

    @Override
    public void execute() {
        box.on();
    }
}
