job('Sample') {
    scm {
        git('https://github.com/TejaswiniTharigopula2295/javademo.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
