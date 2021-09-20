public class cardBoardBoxNotAvailable implements Box{
    private cardBoardBox box;

    public cardBoardBoxNotAvailable(cardBoardBox box) {
        this.box = box;
    }

    @Override
    public void execute() {
        box.off();
    }
}
