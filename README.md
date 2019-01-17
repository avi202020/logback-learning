Execute Parent.main() to see the logs.

- Logs from package `davenkin.parent.child1` can log DEBUG message and send to ROOT logger
- Logs from Child3 is performance log, it only logs to `performance.log`
- All other logs is send to ROOT logger and the Level is INFO