# rootrecord-common

Shared Java library for RootMC Paper plugins (not a Bukkit plugin - do **not** drop this jar into `plugins/` alone).

**Version:** `1.7.1`
**Group:** `com.rootrecord.minecraft`
**Author:** Root Record

## What it is

`rootrecord-common` is compiled into each RootMC plugin via the monorepo Gradle graph:

```kotlin
implementation(project(":plugins:rootrecord-common"))
```

Standalone plugin repositories publish sources for transparency. **Builds** are produced from the RootMC Plugin Building monorepo.

## Paid download

**Jars are sold on [BuiltByBit](https://builtbybit.com/) (listing coming soon).**

This GitHub repo is the public explainer (install notes, commands, links) for discovery. It is **not** a free jar download mirror.

## Install / use

1. Do not install this artifact as a server plugin.
2. Feature plugins depend on it at compile time through the monorepo.
3. Licensed builds ship with paid plugins from BuiltByBit when listed.

## Links

| Resource | URL |
|----------|-----|
| Website | https://rootmc.net |
| Plugin catalog | https://rootmc.net/plugins/ |
| This plugin page | https://rootmc.net/plugins/rootrecord-common/ |
| Suite wiki | https://rootmc.net/wiki/plugins/ |
| Player wiki | https://rootmc.net/wiki/player/ |
| Constitution | https://rootmc.net/wiki/constitution/ |
| Economy guide | https://rootmc.net/wiki/economy/ |
| Developer keys | https://rootmc.net/developer/keys/ |
| Manifest | https://rootmc.net/plugins/manifest.json |
| Play | `play.rootmc.net` |
| Live map | https://map.rootmc.net |
| API | https://api.rootmc.net |
| Discord | https://discord.gg/rFFQYrNaqS |
| GitHub (this repo) | https://github.com/RootRecord/rootrecord-common |
| Releases (version notes) | https://github.com/RootRecord/rootrecord-common/releases |
| BuiltByBit (paid jars) | https://builtbybit.com/ (listing coming soon) |

**Discord:** RootMC community - join for support, announcements, and governance: https://discord.gg/rFFQYrNaqS


## License

Copyright Root Record. All rights reserved. Public docs are for discovery; redistribution of binaries or source for commercial use requires Root Record permission.

