package suleman.com;

public class MainPresenterImpl implements MainPresenter,GetQuoteInteractor.OnFinishedListener {
    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImpl(MainView mainView, GetQuoteInteractor quoteInteractor) {
        this.mainView = mainView;
        this.getQuoteInteractor = quoteInteractor;
    }

    @Override
    public void onButtonClick() {
        if (mainView != null) {
            mainView.showProgress();
        }
            getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(String string) {
        if (mainView != null) {
            mainView.setQuote(string);
            mainView.hideProgress();
        }
    }
}
