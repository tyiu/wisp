package wisp.logging

import mu.KLogger
import mu.Marker
import wisp.sampling.Sampler

internal class SampledLogger constructor(
    override val underlyingLogger: KLogger,
    private val sampler: Sampler
) : KLogger by underlyingLogger {

    override fun debug(msg: () -> Any?) = sampled { underlyingLogger.debug(msg) }

    override fun debug(t: Throwable?, msg: () -> Any?) = sampled { underlyingLogger.debug(t, msg) }

    override fun debug(marker: Marker?, msg: () -> Any?) = sampled { underlyingLogger.debug(marker, msg) }

    override fun debug(marker: Marker?, t: Throwable?, msg: () -> Any?) = sampled {
        underlyingLogger.debug(marker, t, msg)
    }

    override fun debug(msg: String?) = sampled { underlyingLogger.debug(msg) }

    override fun debug(format: String?, arg: Any?) = sampled { underlyingLogger.debug(format, arg) }

    override fun debug(format: String?, arg1: Any?, arg2: Any?) = sampled { underlyingLogger.debug(format, arg1, arg2) }

    override fun debug(format: String?, vararg arguments: Any?) = sampled {
        underlyingLogger.debug(format, arguments)
    }

    override fun debug(msg: String?, t: Throwable?) = sampled { underlyingLogger.debug(msg, t) }

    override fun debug(marker: Marker?, msg: String?) = sampled {
        underlyingLogger.debug(marker, msg)
    }

    override fun debug(marker: Marker?, format: String?, arg: Any?) = sampled {
        underlyingLogger.debug(marker, format, arg)
    }

    override fun debug(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) = sampled {
        underlyingLogger.debug(marker, format, arg1, arg2)
    }

    override fun debug(marker: Marker?, format: String?, vararg arguments: Any?) = sampled {
        underlyingLogger.debug(marker, format, arguments)
    }

    override fun debug(marker: Marker?, msg: String?, t: Throwable?) = sampled {
        underlyingLogger.debug(marker, msg, t)
    }

    override fun error(msg: () -> Any?) = sampled { underlyingLogger.error(msg) }

    override fun error(t: Throwable?, msg: () -> Any?) = sampled { underlyingLogger.error(t, msg) }

    override fun error(marker: Marker?, msg: () -> Any?) = sampled { underlyingLogger.error(marker, msg) }

    override fun error(marker: Marker?, t: Throwable?, msg: () -> Any?) = sampled {
        underlyingLogger.error(marker, t, msg)
    }

    override fun error(msg: String?) = sampled { underlyingLogger.error(msg) }

    override fun error(format: String?, arg: Any?) = sampled { underlyingLogger.error(format, arg) }

    override fun error(format: String?, arg1: Any?, arg2: Any?) = sampled { underlyingLogger.error(format, arg1, arg2) }

    override fun error(format: String?, vararg arguments: Any?) = sampled { underlyingLogger.error(format, arguments) }

    override fun error(msg: String?, t: Throwable?) = sampled { underlyingLogger.error(msg, t) }

    override fun error(marker: Marker?, msg: String?) = sampled { underlyingLogger.error(marker, msg) }

    override fun error(marker: Marker?, format: String?, arg: Any?) = sampled {
        underlyingLogger.error(marker, format, arg)
    }

    override fun error(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) = sampled {
        underlyingLogger.error(marker, format, arg1, arg2)
    }

    override fun error(marker: Marker?, format: String?, vararg arguments: Any?) = sampled {
        underlyingLogger.error(marker, format, arguments)
    }

    override fun error(marker: Marker?, msg: String?, t: Throwable?) = sampled {
        underlyingLogger.error(marker, msg, t)
    }

    override fun info(msg: () -> Any?) = sampled { underlyingLogger.info(msg) }

    override fun info(t: Throwable?, msg: () -> Any?) = sampled { underlyingLogger.info(t, msg) }

    override fun info(marker: Marker?, msg: () -> Any?) = sampled { underlyingLogger.info(marker, msg) }

    override fun info(marker: Marker?, t: Throwable?, msg: () -> Any?) = sampled {
        underlyingLogger.info(marker, t, msg)
    }

    override fun info(msg: String?) = sampled { underlyingLogger.info(msg) }

    override fun info(format: String?, arg: Any?) = sampled { underlyingLogger.info(format, arg) }

    override fun info(format: String?, arg1: Any?, arg2: Any?) = sampled { underlyingLogger.info(format, arg1, arg2) }

    override fun info(format: String?, vararg arguments: Any?) = sampled { underlyingLogger.info(format, arguments) }

    override fun info(msg: String?, t: Throwable?) = sampled { underlyingLogger.info(msg, t) }

    override fun info(marker: Marker?, msg: String?) = sampled { underlyingLogger.info(marker, msg) }

    override fun info(marker: Marker?, format: String?, arg: Any?) = sampled {
        underlyingLogger.info(marker, format, arg)
    }

    override fun info(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) = sampled {
        underlyingLogger.info(marker, format, arg1, arg2)
    }

    override fun info(marker: Marker?, format: String?, vararg arguments: Any?) = sampled {
        underlyingLogger.info(marker, format, arguments)
    }

    override fun info(marker: Marker?, msg: String?, t: Throwable?) = sampled { underlyingLogger.info(marker, msg, t) }

    override fun trace(msg: () -> Any?) = sampled { underlyingLogger.trace(msg) }

    override fun trace(t: Throwable?, msg: () -> Any?) = sampled { underlyingLogger.trace(t, msg) }

    override fun trace(marker: Marker?, msg: () -> Any?) = sampled {
        underlyingLogger.trace(marker, msg)
    }

    override fun trace(marker: Marker?, t: Throwable?, msg: () -> Any?) = sampled {
        underlyingLogger.trace(marker, t, msg)
    }

    override fun trace(msg: String?) = sampled { underlyingLogger.trace(msg) }

    override fun trace(format: String?, arg: Any?) = sampled { underlyingLogger.trace(format, arg) }

    override fun trace(format: String?, arg1: Any?, arg2: Any?) = sampled { underlyingLogger.trace(format, arg1, arg2) }

    override fun trace(format: String?, vararg arguments: Any?) = sampled { underlyingLogger.trace(format, arguments) }

    override fun trace(msg: String?, t: Throwable?) = sampled { underlyingLogger.trace(msg, t) }

    override fun trace(marker: Marker?, msg: String?) = sampled { underlyingLogger.trace(marker, msg) }

    override fun trace(marker: Marker?, format: String?, arg: Any?) = sampled {
        underlyingLogger.trace(marker, format, arg)
    }

    override fun trace(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) = sampled {
        underlyingLogger.trace(marker, format, arg1, arg2)
    }

    override fun trace(marker: Marker?, format: String?, vararg argArray: Any?) = sampled {
        underlyingLogger.trace(marker, format, argArray)
    }

    override fun trace(marker: Marker?, msg: String?, t: Throwable?) = sampled {
        underlyingLogger.trace(marker, msg, t)
    }

    override fun warn(msg: () -> Any?) = sampled { underlyingLogger.warn(msg) }

    override fun warn(t: Throwable?, msg: () -> Any?) = sampled { underlyingLogger.warn(t, msg) }

    override fun warn(marker: Marker?, msg: () -> Any?) = sampled { underlyingLogger.warn(marker, msg) }

    override fun warn(marker: Marker?, t: Throwable?, msg: () -> Any?) = sampled {
        underlyingLogger.warn(marker, t, msg)
    }

    override fun warn(msg: String?) = sampled { underlyingLogger.warn(msg) }

    override fun warn(format: String?, arg: Any?) = sampled { underlyingLogger.warn(format, arg) }

    override fun warn(format: String?, vararg arguments: Any?) = sampled {
        underlyingLogger.warn(format, arguments)
    }

    override fun warn(format: String?, arg1: Any?, arg2: Any?) = sampled {
        underlyingLogger.warn(format, arg1, arg2)
    }

    override fun warn(msg: String?, t: Throwable?) = sampled { underlyingLogger.warn(msg, t) }

    override fun warn(marker: Marker?, msg: String?) = sampled { underlyingLogger.warn(marker, msg) }

    override fun warn(marker: Marker?, format: String?, arg: Any?) = sampled {
        underlyingLogger.warn(marker, format, arg)
    }

    override fun warn(marker: Marker?, format: String?, arg1: Any?, arg2: Any?) = sampled {
        underlyingLogger.warn(marker, format, arg1, arg2)
    }

    override fun warn(marker: Marker?, format: String?, vararg arguments: Any?) = sampled {
        underlyingLogger.warn(marker, format, arguments)
    }

    override fun warn(marker: Marker?, msg: String?, t: Throwable?) = sampled { underlyingLogger.warn(marker, msg, t) }

    private inline fun sampled(f: () -> Unit) {
        if (sampler.sample()) f()
    }
}
