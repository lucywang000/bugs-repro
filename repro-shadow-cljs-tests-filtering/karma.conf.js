module.exports = function (config) {
    config.set({
      browsers: ['Chrome'],
      // The directory where the output file lives
      basePath: 'karmatest/',
      // The file itself
      files: [
        'ci.js',
      ],
      frameworks: ['cljs-test'],
      plugins: ['karma-cljs-test', 'karma-chrome-launcher'],
      colors: true,
      logLevel: config.LOG_INFO,
      client: {
        args: ["shadow.test.karma.init"],
        singleRun: true
      }
    })
};
