# androidSelfView
create an android self view.

Created a view PingPongView draws bitmap image pingpong.png saved in res/drawable. 

Drawing happens in PinPongView::onDraw(Context) method;

This PingPongView is created in MainActivity, and addedto the layout pulled at MainActivity::onCreate(Bundle) method.
The view instance then adds onTouchListener, and overrides the listener's onTouch method, capturing the touch-location (x, y), 
and sets the view's bitmap's location x, y.   Hence, the ping pong moves to the touched location on screen.
