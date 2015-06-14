# rn-commonjs
Test React Native commonjs processing

# Usage

1. Build ClojureScript master and ensure that `project.clj` refers to it.
2. Check out https://github.com/facebook/react-native into a sibling directory of this project. (The `Libraries` symbolic link points into it.)
3. `lein cljsbuild once`

Then look in `out` to see the generated files.

If you look at `out/crc32.js` you will see that the conversion succeeded for that dep.
On the other hand, many files end up as emtpy stubs, like `out/_shouldPolyfillES6Collection.js`.

Note: The `:foreign-libs` portion of `project.clj` was produced using [derevo](https://github.com/mfikes/derevo).
