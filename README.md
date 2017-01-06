# Atomist 'cljs-example-editor'

[![Slack Status](https://join.atomist.com/badge.svg)](https://join.atomist.com)

This [Rug](http://docs.atomist.com/) is an example of a ClojureScript based editor.

*This rug is not published, and will never be, and therefore cannot be consumed by other rugs*

## Notes

*   Need to make sure that external things like Rug types are expressed in 'externs.js'. Otherwise, the google closure compiler breaks some stuff.
*   Always use :advanced optimizations in project.clj to make it work in Nashorn
*   Use (clj-i\>js ...) for parameters to JS/Rug things

## Rugs

### AddGpl3LicenseFile

The AddGpl3LicenseFile editor adds a GPL-3.0 license file to a project.  If a
license file already exists in the project, it replaces it.  If more
than one license file exists in the project, it refuses to do
anything.

#### Prerequisites

Before running this Editor, you must have the following prerequisites
satisfied.

*   A project with zero or one license file

#### Parameters

To  editor requires no parameters

#### Running

This is currently not published, so only running locally is supported:

```bash
rug -Xl edit AddGpl3LicenseFile -C <some project dir>
```

## Support

General support questions should be discussed in the `#support`
channel on our community slack team
at [atomist-community.slack.com][slack].

If you find a problem, please create an [issue][].

[issue]: https://github.com/atomist-rugs/cljs-example-editor/issues

---
Created by [Atomist][atomist].
Need Help?  [Join our Slack team][slack].

[atomist]: https://www.atomist.com/
[slack]: https://join.atomist.com/
