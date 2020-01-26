# CrossPlatformAPI

Some useful JNI functions that Java does not support yet or supports differently.<br>
*Not all functions may work on all platforms.*<br>
Methods and Classes could change or even be deleted in the future. Everything is subject to change.<br>
Use this API at your own risk.

# Rules
- Read the License (if it exists)
- Do not claim this code as your own
- Extensions and bug fixes (in a copy/fork of it) have to be pushed and not distributed themselves<br>
	- So that in the end there are not 20 forks, wich all contain different bugs.<br>
	- Projects that use this as an API (external plugin) do not have to be published.
- Please do not add @author. If someone else edits the code, chaos will occur. Every code change is mentioned on Github with the author
- Please be nice. For example, if you post a problem.
- Do not post security critical information in an issue. Use the Security tab on Github instead

# Wiki
To the [Wiki](https://github.com/JJBlue/CrossPlatformAPI/wiki)

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
| crossplatformapi.jni.\*    | JNI Interfaces. All JNI Interfaces will be called by an class in the main.\* package |
| crossplatformapi.main.\*   | Methods and Classes which can be used by another Java project. Some Classes call in the background the JNI Interfaces. (or JNI Interfaces can be called directly) |
| crossplatformapi.interfaces.\*    | Some Interfaces for the main.\* packages |
| components.\*    | Some Classes of my other project, which I use in this project too. For example the EventManager. |

# Donation

Nothing here yet...

# Content overview

- Keyboard
- Mouse
- Windows
- Monitors
- ... (and more)

## Keyboard
- press / release / type Key
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

## Mouse
- press / release / type Mouse Button
- move Mouse
- scroll
- horizontal scroll
<br/><br/>
- Listeners: press/release/press Hotkeys
- register / unregister Listener (register could block until unregister is called from another thread)
- block and unblock Mouse (May only work if keyboard listener is activated)

## Window
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
- maximize / is Maximized
- minimize / is Minimized
- restore
<br/><br/>
- hide
- show
<br/><br/>
- Listeners: maximized/minimized/restore/move/resize/foreground changed (Move, resize and restore events might all be triggered by one of these users actions)
- register / unregister Listener (register could block until unregister is called from another thread)

## Display
- get Primary Display
- get all Display
- get Area (x, y, width, height)
- get work Area (x, y, width, height) (In Windows area without the taskbar)

# Question and Answers
## Could I help?
Everyone is welcome to help. You can add/edit/repair some codes. Add/Remove/Edit/Correct some comments. And more.
If you have a jni platform project of this (like Windows, Linux, MacOS, etc...) and want to add this officially. Please contact me.
If you want a jni platform project to work on it. You could create a project in your repositories or I could create a project for you (and add you as a collaborator).

## Can I use it for my project?
Yes. This is a open source project. You could use it in your own project. It's free to use.<br/>
See Rules.

## I have some new ideas/bugs
If you have some new ideas or bugs, please create a issues (or a pull request) for it or write it on discord.
