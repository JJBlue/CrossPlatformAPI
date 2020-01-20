# CrossPlatformAPI

Some useful JNI functions that Java does not yet support or supported different.<br>

Maybe not all functions work on all platforms.<br>
Methods and Classes could be changed in the future. Everything is subject to change.

# About me
I'm a student and work on this project in my free time.

# Discord
[Come to our discord server](https://discord.gg/K7QvyXw)

# Platforms
At the moment, only windows is supported. Other platforms will be added in the future.

# Repositories
[CrossPlatformAPIWindows](https://github.com/JJBlue/CrossPlatformAPIWindows)

# Structure

| Package  | Information |
| -------- | ----------- |
| jni.\*    | JNI Interfaces. All JNI Interfaces will be called by an class in the main.\* package |
| main.\*   | Methods and Classes which can be used by another Java project. Some Classes call in the background the JNI Interfaces. (or JNI Interfaces can be called directly) |
| interfaces.\*    | Some Interfaces for the main.\* packages|

# Some Content

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


# Display
- get Primary Display
- get all Display
- get Area (x, y, width, height)
- get work Area (x, y, width, height) (In Windows area without the taskbar)

# Question and Answers
## Could I help?
Everyone is welcome to help. You can add/edit/repair some codes. Add/Remove/Edit/Correct some comments. And more.
If you have a jni platform project of this (like Windows, Linux, MacOS, etc...) and want to add this officially. Please contact me.
If you want a jni platform project to work on it. You could create a project in your repositories or I could create a project for you (and add you as a collibarator).

## Can I use it for my project?
Yes. This is a open source project. You could use it in your own project. It's free to use.<br/>
Rules:
- Read the License (if it exists)
- Do not say that the whole project was written by your own
- Extensions and bug fixes have to be pushed and not distributed themselves

## I have some new ideas/bugs
If you have some new ideas or bugs, please create a issues for it or write it on discord.