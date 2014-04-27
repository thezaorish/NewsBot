// http://logback.qos.ch/manual/groovy.html
// http://www.javacodegeeks.com/2012/04/using-slf4j-with-logback-tutorial.html

def workingDir = '/opt/program/rnac/'

appender("FILE", RollingFileAppender) {
    file = workingDir + 'logs/web.log'
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} - %msg%n"
    }
    rollingPolicy(TimeBasedRollingPolicy) {
        FileNamePattern = workingDir + "logs/web-%d{yyyy-MM}.log"
    }
}

root(INFO, ["FILE"])