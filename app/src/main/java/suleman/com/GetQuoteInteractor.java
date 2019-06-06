package suleman.com;

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }


    void getNextQuote(OnFinishedListener listener);
}
