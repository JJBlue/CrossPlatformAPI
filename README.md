# CrossPlatformAPI

Some useful JNI functions that Java does not yet support or ... .<br>
Maybe not all functions work on all platforms.<br>
Methods and Classes could be changed in the future. Everything is subject to change.

# Current state
At the moment, only windows is supported.

# TITLE MISSING

- Keyboard
- Mouse
- Windows
- Monitors
- ... (and more)

# Keyboard
- press Key
- release Key
- type Key
- is Key pressed
<br/><br/>
- write text (Windows: uses unicode keys to write a character. Not the real keys)
<br/><br/>
- register Hotkeys
- unregister Hotkeys
<br/><br/>
- get Keyboard Layout (not working in windows at the moment)
<br/><br/>
- Listeners: press/release/press Hotkeys
- register / unregister Listener (register could block until unregister is called from another thread)
- block and unblock Keyboard (May only work if keyboard listener is activated)

# Mouse
- press Mouse Button
- release Mouse Button
- type Mouse Button
- move Mouse
- scroll
- horizontal scroll
<br/><br/>
- Listeners: press/release/press Hotkeys
- register / unregister Listener (register could block until unregister is called from another thread)
- block and unblock Mouse (May only work if keyboard listener is activated)

# Window
- get Window in Foreground
- get all User Windows (Users Windows in Windows are for example all windows, which are shown in ALT+TAB)
- get all Windows
- get Title
- get Position (x, y, width, height)
<br/><br/>
- set TopMost
- to Front / Back
- close
<br/><br/>
- maximize
- minimize
- restore
- is Maximized
- is Minimized
<br/><br/>
- hide
- show
<br/><br/>
- Listeners: maximized/minimized/restore/move/resize/foreground changed (Move, resize and restore events might all be triggered by one of these users actions)
- register / unregister Listener (register could block until unregister is called from another thread)


# Display / Monitor
- get Primary Monitor
- get all Monitors
- get Area (x, y, width, height)
- get work Area (x, y, width, height) (In Windows is the work area, the area without the taskbar)